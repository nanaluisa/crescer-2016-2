//console.log(subtrair(2)(1)); // 1
function subtrair(num1){
  return function(num2){
    return num1 - num2;
  }

}
