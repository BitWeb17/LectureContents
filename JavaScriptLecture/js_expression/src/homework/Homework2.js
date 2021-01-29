const Homework2 = () => {
    const START = 1
    const END = 20

    for(var i = START; i <= END; i++) {
        if(!(i % 2)) {
            console.log("Homework2: " + i)
        }
    }

    return (
        <div className="Homework2">
            <p>
                Homework 2
            </p>
        </div>
    )
}

export default Homework2