
package com.knoldus.db

import com.knoldus.models.User
import scala.collection.immutable.HashMap

class UserReadDto {                       //User data

  val nitinUser: User = User("Nitin","Mittal","knoldus","nitin.mittal@knoldus.com")
  val vaibhavUser: User = User("Vaibhav","Bansal","knoldus","vaibhav.bansal@knoldus.com")
  val users: HashMap[String, User] = HashMap("Nitin" -> nitinUser, "Vaibhav" -> vaibhavUser)

  def getUserByName(name: String): Option[User] = users.get(name)
}
