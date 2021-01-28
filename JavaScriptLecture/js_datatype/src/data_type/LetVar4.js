function LetVar4() {
    let letNum = 33

    console.log("let test: " + letNum)

    // LetVar3과 LetVar4의 차이점은 뭘까 ?
    // let 과 var의 차이점은 뭐지 ?
    // 호이스팅(Hoisting)
    var letNum = "뭐야 ?"

    // 호이스팅은 모든 변수가 프로그램 시작시
    // 최선두에 선언하는 형식과 같이 동작하는 것을 의미한다.
    // 좀 더 쉽게 말하자면 var는 변수 선언과 값의 할당이 통합된다.
    // 반면 let은 변수 선언과 값의 할당이 분리되어 있다.

    // 그러다보니 var는 변수 생성시 이름이 같은게 있으면
    // Mangling 이라는 방식을 통해서 변수의 이름을 바꿔버린다.
    // 반면 let은 선언과 할당이 분리되어 있다보니
    // 왜 같은것을 선언하냐면서 문법 오류가 나는 것이다.

    // var 대신 let을 도입하여 좋아진점
    // 신입 개발자들이 var로 같은 변수를 도배하다보니
    // 이전에 중요한 정보가 있었는데 그 정보가 덮어쓰기 되는 일이 많았다.
    // 반면 중요 정보를 let 으로 만들어둠으로써
    // 신입 개발자들의 이와 같은 실수를 원천 차단할 수 있게 되었다.

    console.log("let test: " + letNum)

    return (
        <div className="LetVar4">
            <p>
                let {letNum}<br/>
            </p>
        </div>
    )
}

export default LetVar4