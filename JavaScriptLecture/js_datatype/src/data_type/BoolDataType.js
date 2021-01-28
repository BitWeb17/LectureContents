function BoolDataType() {
    var num1 = 3, num2 = 3, num3 = 7

    var boolRes1 = (num1 === num2)
    var boolRes2 = (num1 === num3)

    console.log("BoolDataType: " + boolRes1)
    console.log("BoolDataType: " + boolRes2)

    var testNum = 0
    var testStr = "0"

    // '=='의 경우 데이터만 확인한다.
    // '==='의 경우 데이터와 해당 데이터의 타입을 함께 확인한다.
    // 즉 데이터타입이 다르다면 false가 된다.

    // 결론: 결국 자바스크립트는 데이터타입이 없는 것이 아니라
    //      실행중에 동적으로 데이터타입이 생성되는 것이다.
    //      데이터타입이 없다고 얘기하는 것은 매우 큰 오개념이다.
    var boolRes3 = (testNum == testStr)
    var boolRes4 = (testNum === testStr)

    console.log("BoolDataType: " + boolRes3)
    console.log("BoolDataType: " + boolRes4)

    return (
        <div className="BoolDataType">
            <p>
                {boolRes1.toString()}, {boolRes2.toString()}<br/>
                {boolRes3.toString()}, {boolRes4.toString()}<br/>
            </p>
        </div>
    )
}

export default BoolDataType