// P04 (*) Find the number of elements of a list.
//     Example:
//     scala> length(List(1, 1, 2, 3, 5, 8))
//     res0: Int = 6

def length[A](list: List[A]) : Int = list.length

println(length(List(1, 1, 2, 3, 5, 8)))
