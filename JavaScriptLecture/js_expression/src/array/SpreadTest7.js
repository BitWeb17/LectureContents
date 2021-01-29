const SpreadTest7 = () => {
    let newObj = {
        name: "newObj",
        number: 3
    }

    console.log("SpreadTest7: " + newObj)
    console.log("SpreadTest7: " + newObj.name)
    console.log("SpreadTest7: " + newObj.number)

    let newObj2 = {...newObj}

    console.log("SpreadTest7: " + newObj2)
    console.log("SpreadTest7: " + newObj2.name)
    console.log("SpreadTest7: " + newObj2.number)

    newObj2 = {
        nickname: "SpreadTest"
    }

    let newObj3 = {...newObj, ...newObj2}

    console.log("SpreadTest7: " + newObj3)
    console.log("SpreadTest7: " + newObj3.name)
    console.log("SpreadTest7: " + newObj3.number)
    console.log("SpreadTest7: " + newObj3.nickname)

    // alert을 통해 웹 페이지에 경고 메시지를 띄울 수 있다.
    // alert("hihi");

    // JSON.stringify를 통해 object에 들어있는 내용을 확인할 수 있다.
    console.log("SpreadTest7: " + JSON.stringify(newObj3))

    return (
        <div className="SpreadTest6">
            <p>
                Spread Test 7
            </p>
        </div>
    )
}

export default SpreadTest7