const FuncTest = () => {
    const add = (first, second, ... args) => {
        console.log("first = " + first + ", second = " +
            second + ", args = " + args)

        let sum = first + second

        for(let i = 0; i < args.length; i++) {
            sum += args[i]
        }

        return sum
    }

    let sum = add(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    console.log(sum)

    return (
        <div className="FuncTest">
            <p>FuncTest</p>
        </div>
    )
}

export default FuncTest