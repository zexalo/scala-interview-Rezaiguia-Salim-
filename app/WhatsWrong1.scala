package com.particeep.test


object WhatsWrong1 extends App{

  trait Interface {
    val city: String


  }

  case object Supporter extends Interface {

    override val city = "Paris"
    val support: String = s"Ici c'est $city !"

  }

  println(Supporter.city) //What does this print ? it print Paris
  println(Supporter.support) //What does this print and why ? How to fix it ?
} //it print : Ici c'est null ! because city variable is not declared.So, move support variable (support: String = s"Ici c'est $city !") 
//after the delaration of paris variable "override val city = "Paris""
