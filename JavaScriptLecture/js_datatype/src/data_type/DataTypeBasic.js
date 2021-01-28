function DataTypeBasic() {
    // var는 변수 선언할 때 사용한다.
    var length = 7      // 정수형도 var
    var lastName = "Gogosing"       // 문자열도 var
    var x = {firstName: "Rust", lastName: "Golang"} // 묶음 형식도 var

    // console.log()를 통해서
    // 웹 페이지에서 F12를 누르고 콘솔을 눌러
    // 콘솔 메시지를 확인할 수 있다.
    // 즉 브라우저용 디버깅에 유용하게 활용할 수 있다.
    console.log("DataTypeBasic: " + length)
    console.log("DataTypeBasic: " + lastName)
    console.log("DataTypeBasic: " + x.firstName)
    console.log("DataTypeBasic: " + x.lastName)

    // div의 약자는 Division으로
    // 웹 사이트의 레이아웃(전체적인 틀)을 만들때 사용함

    // p는 paragraph 태그로 하나의 문단을 만들때 사용된다.

    // div에 className이라는 것이 보이는데
    // 이 부분은 향후 CSS를 할 때 좀 더 자세히 알아볼 것임
    return (
        <div className="DataTypeBasic">
            <p>
                {length}, {lastName}, {x.toString()}.
            </p>
        </div>
    )
}

export default DataTypeBasic