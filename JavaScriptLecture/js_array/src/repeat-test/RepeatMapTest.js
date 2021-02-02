const RepeatMapTest = () => {
    let seq = [1, 2, 3, 4, 5]
    let seqSquare = seq.map(squareFunc)
    // map은 보통 연산시 활용하는 녀석으로
    // seq 배열에 있는 모든 요소에 squareFunc()을 적용한다.

    function squareFunc(value) {
        return value * value
    }

    console.log("seq: " + seq)
    console.log("seqSquare: " + seqSquare)

    return (
        <div className="RepeatMapTest">
            <p>
                repeat-test: RepeatMapTest
            </p>
        </div>
    )
}

export default RepeatMapTest