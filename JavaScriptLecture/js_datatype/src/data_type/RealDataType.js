function RealDataType() {
    // 소수점의 경우 .0의 경우 출력시 정수형과 별 다른 차이가 없음
    var floatNum1 = 33.0
    var intNum = 33
    // 명확하게 0.1 형태의 숫자가 있을때는 출력한다.
    var floatNum2 = 37.1
    // .00 의 경우에는 소수점이라는 것을 알려주기 위해 . 을 표현해준다.
    var floatNum3 = 33.00

    console.log("RealDataType: " + floatNum1)
    console.log("RealDataType: " + intNum)
    console.log("RealDataType: " + floatNum2)
    console.log("RealDataType: " + floatNum3)

    return (
        <div className="StringDataType">
            <p>
                {floatNum1}, {intNum}, {floatNum2}, {floatNum3}.
            </p>
        </div>
    )
}

export default RealDataType