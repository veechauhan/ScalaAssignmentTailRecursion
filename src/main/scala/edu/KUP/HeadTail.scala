package edu.KUP

class HeadTail {
  def isort(restList: List[Int]): List[Int] = restList match {
    case List() => List()
    case head :: restList1 => insert(head, isort(restList1))
  }

  def insert(head: Int, restList: List[Int]): List[Int] = restList match {
    case List() => List(head)
    case x :: xs => if (head <= xs) head :: restList else x :: insert(head, xs)
  }
}



