def sort(xs : Array[Int]) : Array[Int] = {
  if (xs.length <= 1) xs
  else{
    //val getPivot = xs.length/2
    //val accessMiddleElement = xs(getPivot)
    val pivot = xs(xs.length/2)
    Array.concat(
      sort(xs filter(pivot >)),
      xs filter(pivot ==),
      xs filter(pivot <)
    )
  }
}

sort(Array(3,5,3,51,23,1,333,56,1,7,86,9,7))