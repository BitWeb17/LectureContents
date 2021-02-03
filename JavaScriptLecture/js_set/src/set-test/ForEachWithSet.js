const ForEachWithSet = () => {
    let setData = new Set()

    setData.add("Cherry")
    setData.add("strawberry")
    setData.add("apple")

    console.log(setData)

    setData.forEach(function(val1, val2) {
        console.log(val1 + " : " + val2)
    })

    setData.forEach((val1, val2) =>
        console.log("arrow - " + val1 + " : " + val2)
    )

    return (
        <div className="ForEachWithSet">
            <p>ForEachWithSet</p>
        </div>
    )
}

export default ForEachWithSet