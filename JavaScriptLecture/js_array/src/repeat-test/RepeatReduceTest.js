const RepeatReduceTest = () => {
    let seq = [1, 2, 3, 4, 5]
    let sum = seq.reduce(reduceFunc)
    // map은 보통 연산시 활용하는 녀석으로
    // seq 배열에 있는 모든 요소에 squareFunc()을 적용한다.

    function reduceFunc(total, value, value2) {
        return total + value + value2
    }

    console.log("After reduce(): " + sum)

    let testSum = seq.reduce(reduceFunc, 333, 10)
    console.log(testSum)

    return (
        <div className="RepeatReduceTest">
            <p>
                repeat-test: RepeatReduceTest
            </p>
        </div>
    )
}

export default RepeatReduceTest