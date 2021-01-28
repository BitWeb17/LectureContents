function StringDataType() {
    // 자바스크립트는 아래와 같이
    // 문자열 자체에 홑 따옴표, 쌍따옴표 작성이 문제가 되지 않는다.
    // 적고 싶은 형태로 마음대로 작성해도 무방하다.
    var strTest1 = "It's OK"
    var strTest2 = "I can 'use' this"
    var strTest3 = 'I can do "this" too'

    console.log("StringDataType: " + strTest1)
    console.log("StringDataType: " + strTest2)
    console.log("StringDataType: " + strTest3)

    // <br/> 태그는 앤터와 유사한 역할을 수행한다 보면 되겠다.
    return (
        <div className="StringDataType">
            <p>
                {strTest1}<br/>
                {strTest2}<br/>
                {strTest3}<br/>
            </p>
        </div>
    )
}

export default StringDataType