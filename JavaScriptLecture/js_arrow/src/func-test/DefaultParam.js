const DefaultParam = () => {
    const defParam = (first, second = 3) => {
        return first + second
    }

    let sum = defParam(1, 2)

    console.log(sum)

    sum = defParam(1)

    console.log(sum)

    return (
        <div className="DefaultParam">
            <p>DefaultParam</p>
        </div>
    )
}

export default DefaultParam