// P03 (*) Find the Kth element of a list.
//     By convention, the first element in the list is element 0.
//     Example:
//     scala> nth(2, List(1, 1, 2, 3, 5, 8))
//     res0: Int = 2

def nth[A](n: Int, list: List[A]) : A = {
    if (list.length <= n)
        throw new NoSuchElementException;
    list(n)
}

println(nth(2, List(1, 1, 2, 3, 5, 8)));
