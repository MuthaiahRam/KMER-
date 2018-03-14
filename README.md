# KMER-

Implement a KMER counter using Hadoop Map Reducer 

There are no spaces in the human genome, we will count overlapping KMERs

The idea is if the genome is:

ACACACAGT
And we are counting 3-MERs, your map function will output
ACA 1
CAC 1
ACA 1
CAC 1
ACA 1
CAG 1
AGT 1

The shuffle function will sort them so the same key comes right after each other
ACA 1
ACA 1
ACA 1
CAC 1
CAC 1
CAG 1
AGT 1

And the reducer will output:
ACA 3
CAC 2
CAG 1
AGT 1