// P02 (*) Find the last but one element of a list.
//     Example:
//     scala> penultimate(List(1, 1, 2, 3, 5, 8))
//     res0: Int = 5

ef penultimate[A](elements: List[A]) : A = {
    if (elements.length < 2)
        throw new NoSuchElementException;
    elements.init.last
}

println(penultimate(List(1, 1, 2, 3, 5, 8)))