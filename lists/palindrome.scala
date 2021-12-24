// P06 (*) Find out whether a list is a palindrome.
//     Example:
//     scala> isPalindrome(List(1, 2, 3, 2, 1))
//     res0: Boolean = true

def isPalindrome[A](elements: List[A]) : Boolean = elements == elements.reverse

println(isPalindrome(List(1, 2, 3, 2, 1)))