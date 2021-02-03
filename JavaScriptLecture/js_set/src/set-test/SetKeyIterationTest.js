const SetKeyIterationTest = () => {
    console.log("SetKeyIterationTest Start")

    let setData = new Set()

    setData.add("Cherry")
    setData.add("strawberry")
    setData.add("apple")

    console.log(setData)

    var setIter = setData.keys()

    for (var key of setIter) {
        console.log(key)
    }

    console.log("SetKeyIterationTest Fin")

    return (
        <div className="SetIterationTest">
            <p>SetKeyIterationTest</p>
        </div>
    )
}

export default SetKeyIterationTest