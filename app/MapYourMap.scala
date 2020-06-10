package com.particeep.test

/**
  * Tell developer names by the department code
  * Expected result:
  * Map(frontend -> List(Remy, Alexandre), analytics -> List(Pierre), api -> List(Noe))
  */
object MapYourMap extends App{

  val devNames = Map("dev1" -> "Pierre", "dev2" -> "Remy", "dev3" -> "Noe", "dev4" -> "Alexandre")
  val devDepartments = Map("dev1" -> "analytics", "dev2" -> "frontend", "dev3" -> "api", "dev4" -> "frontend")
  var namesInDepartments: Map[String, List[String]] = scala.Predef.Map[String, List[String]]()
  var liste: List[String] = List()





  devDepartments.keys.foreach{ i =>
    liste =devNames(i)::liste//add value to the list
    if(namesInDepartments.contains(devDepartments(i))){//if the map already contain the departement
     //we add the new member in the departement list
      namesInDepartments += (devDepartments(i) -> (devNames(i) :: (namesInDepartments get devDepartments(i) getOrElse Nil)))
    }else{// create new departement with the right members
      namesInDepartments+=(devDepartments(i)->liste)
    }

    liste=liste.drop(liste.length)//remove all values from the list 

  }
  println(namesInDepartments)
}
