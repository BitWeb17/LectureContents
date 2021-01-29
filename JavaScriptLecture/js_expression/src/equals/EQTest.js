const EQTest = () => {
    let name = "test"

    // 값이 뭔가 있으면 ??? true
    if(name) {
        console.log("ture")
    } else {
        console.log("false")
    }

    if(!name) {
        console.log("(not)ture")
    } else {
        console.log("(not)false")
    }

    return (
        <div className="EQTest">
            <p>
                Equals Test
            </p>
        </div>
    )
}

export default EQTest