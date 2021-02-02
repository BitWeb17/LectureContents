const ArrayRepeatTest = () => {
    let arr = [1, 3, 8, 10, 5, 7, 11, 19, 77, 33]
    let txt = ""

    function testFunc(value) {
        txt = txt + value + "<br>"
    }

    console.log("Before testFunc: " + txt)
    // 배열에 있는 요소 하나 하나를 testFunc의 입력 인자로 설정함
    // 모든 요소를 순회하고 더 이상 요소가 없으면 중지함
    arr.forEach(testFunc)
    console.log("After testFunc: " + txt)

    return (
        <div className="ArrayRepeatTest">
            <p>
                repeat-test: ArrayRepeatTest
            </p>
        </div>
    )
}

export default ArrayRepeatTest