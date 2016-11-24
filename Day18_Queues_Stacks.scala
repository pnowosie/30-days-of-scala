// https://www.hackerrank.com/challenges/30-queues-stacks
class Solution {
  val stack = Stack[Char]()
  val queue = Queue[Char]()
  
  def pushCharacter(c: Char) = stack push c
  def popCharacter()         = stack.pop
  
  def enqueueCharacter(c: Char) = queue += c
  def dequeueCharacter()        = queue.dequeue
}
