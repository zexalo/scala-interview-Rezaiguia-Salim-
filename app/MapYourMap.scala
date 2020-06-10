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
  var iter=1;




  devDepartments.keys.foreach{ i =>
    liste =devNames(i)::liste
    if(namesInDepartments.contains(devDepartments(i))){
      namesInDepartments += (devDepartments(i) -> (devNames(i) :: (namesInDepartments get devDepartments(i) getOrElse Nil)))
    }else{
      namesInDepartments+=(devDepartments(i)->liste)
    }

    liste=liste.drop(iter)
    iter+=1

  }
  println(namesInDepartments)
}
