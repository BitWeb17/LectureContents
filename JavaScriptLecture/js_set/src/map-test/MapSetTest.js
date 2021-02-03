const MapSetTest = () => {
    let mapData = new Map(
        [
            ["apple", "red"], ["grape", "purple"]
        ]
    )

    console.log(mapData)

    mapData.set("test1", "blue")
    mapData.set("test2", "green")

    console.log(mapData)
    console.log(mapData.get("test2"))
    console.log(mapData.get("grape"))
    console.log(mapData.has("test1"))
    console.log(mapData.has("apple"))

    return (
        <div className="MapSetTest">
            <p>MapSetTest</p>
        </div>
    )
}

export default MapSetTest