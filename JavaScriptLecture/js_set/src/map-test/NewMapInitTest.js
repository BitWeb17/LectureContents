const NewMapInitTest = () => {
    let mapData = new Map(
        [
            ["apple", "red"], ["grape", "purple"]
        ]
    )

    console.log(mapData)
    console.log("Size: " + mapData.size)

    return (
        <div className="NewMapInitTest">
            <p>NewMapInitTest</p>
        </div>
    )
}

export default NewMapInitTest