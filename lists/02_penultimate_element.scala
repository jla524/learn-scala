// P02 (*) Find the last but one element of a list.
//     Example:
//     scala> penultimate(List(1, 1, 2, 3, 5, 8))
//     res0: Int = 5

def penultimate[A](list: List[A]) : A = {
    if (list.length < 2)
        throw new NoSuchElementException;
    list.init.last
}

println(penultimate(List(1, 1, 2, 3, 5, 8)))
