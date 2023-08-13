import multiprocessing
import itertools
import math

def sieve_segment(segment_start, segment_end):
    limit = int(math.sqrt(segment_end)) + 1
    sieve = [True] * (limit + 1)
    for num in range(2, int(limit**0.5) + 1):
        if sieve[num]:
            sieve[num*num::num] = [False] * len(sieve[num*num::num])
    primes = [num for num in range(2, limit) if sieve[num]]

    segment_sieve = [True] * (segment_end - segment_start + 1)
    for prime in primes:
        start_idx = max(prime*prime, (segment_start // prime) * prime)
        for num in range(start_idx, segment_end + 1, prime):
            segment_sieve[num - segment_start] = False

    for num, is_prime in enumerate(segment_sieve, start=segment_start):
        if is_prime:
            print(num)

def worker(start, step):
    for start_segment in itertools.count(start, step * 10**6):
        sieve_segment(start_segment, start_segment + 10**6 - 1)

if __name__ == "__main__":
    processes = []
    num_processes = multiprocessing.cpu_count()
    
    for i in range(num_processes):
        p = multiprocessing.Process(target=worker, args=(i * 10**6, num_processes))
        processes.append(p)
        p.start()

    for p in processes:
        p.join()
