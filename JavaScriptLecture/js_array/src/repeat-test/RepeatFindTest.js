const RepeatFindTest = () => {
    let seq = [1, 2, 3, 4, 5]
    let firstFind = seq.find(findFunc)

    function findFunc(value) {
        return value > 2
    }

    console.log("After find(): " + firstFind)

    let firstFindIdx = seq.findIndex(findIdxFunc)

    function findIdxFunc(value) {
        return value > 4
    }

    console.log("After findIndex(): " + firstFindIdx)

    return (
        <div className="RepeatFindTest">
            <p>
                repeat-test: RepeatFindTest
            </p>
        </div>
    )
}

export default RepeatFindTest