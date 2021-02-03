const SetEntryIterationTest = () => {
    console.log("SetEntryIterationTest Start")

    let setData = new Set()

    setData.add("Cherry")
    setData.add("strawberry")
    setData.add("apple")

    console.log(setData)

    var setIter = setData.entries()

    for (var entry of setIter) {
        console.log(entry)
    }

    console.log("SetEntryIterationTest Fin")

    return (
        <div className="SetEntryIterationTest">
            <p>SetEntryIterationTest</p>
        </div>
    )
}

export default SetEntryIterationTest