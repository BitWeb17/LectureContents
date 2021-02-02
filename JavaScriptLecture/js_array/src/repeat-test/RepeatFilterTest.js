const RepeatFilterTest = () => {
    let seq = [1, 2, 3, 4, 5]
    let over3 = seq.filter(filterFunc)
    // filter 또한 map과 유사하지만
    // 특정한 값을 걸러낸다는 의미로 활용된다.
    // 마찬가지로 seq에 있는 요소들을 모두 빼서 filteFunc으로 전달한다.

    function filterFunc(value) {
        return value > 3
    }

    console.log("seq: " + seq)
    console.log("over3: " + over3)

    return (
        <div className="RepeatFilterTest">
            <p>
                repeat-test: RepeatFilterTest
            </p>
        </div>
    )
}

export default RepeatFilterTest