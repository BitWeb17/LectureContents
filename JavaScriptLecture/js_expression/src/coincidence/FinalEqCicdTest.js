const FinalEqCicdTest = () => {
    let test = 0

    if(test) {
        console.log("success")
    } else {
        console.log("failure")
    }

    // 결국 문자열 형태로 숫자가 날아왔을때
    // 값의 비교는 숫자와 == 을 사용하여 비교해도 무방하다.
    if(test == false) {
        console.log("success")
    } else {
        console.log("failure")
    }

    // 그러나 값 자체의 데이터타입이 중요하다면 === 을 사용하도록 한다.
    if(test === false) {
        console.log("success")
    } else {
        console.log("failure")
    }

    return (
        <div className="FinalEqCicdTest">
            <p>
                Final Equals Coincidence Test
            </p>
        </div>
    )
}

export default FinalEqCicdTest