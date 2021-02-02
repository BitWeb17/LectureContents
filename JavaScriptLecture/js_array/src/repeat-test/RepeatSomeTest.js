const RepeatSomeTest = () => {
    let seq = [1, 2, 3, 4, 5]
    let orTestSuccess = seq.some(orTestFunc)

    function orTestFunc(value) {
        return value > 3
    }

    console.log("After some(): " + orTestSuccess)

    return (
        <div className="RepeatSomeTest">
            <p>
                repeat-test: RepeatSomeTest
            </p>
        </div>
    )
}

export default RepeatSomeTest