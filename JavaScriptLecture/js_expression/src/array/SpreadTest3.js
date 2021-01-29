const SpreadTest3 = () => {
    let arr = [1, 2, 3]

    console.log("SpreadTest3: " + arr)

    // ??? 현재 굉장히 거슬릴것임
    // 1) 함수 내에 함수가 들어있음
    // 2) 입력 인자에 데이터타입이 없음
    function spreadArrPrint(a, b, c) {
        console.log("spreadArrPrint: " + a)
        console.log("spreadArrPrint: " + b)
        console.log("spreadArrPrint: " + c)
    }

    spreadArrPrint(...arr)

    return (
        <div className="SpreadTest3">
            <p>
                Spread Test 3
            </p>
        </div>
    )
}

export default SpreadTest3