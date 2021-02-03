const AddSetTest = () => {
    let setData = new Set()

    setData.add("Cherry")
    setData.add("strawberry")
    setData.add("apple")

    console.log(setData)
    console.log("AddSetTest: " + setData.has("apple"))
    console.log("AddSetTest: " + setData.has("grape"))

    return (
        <div className="AddSetTest">
            <p>AddSetTest</p>
        </div>
    )
}

export default AddSetTest