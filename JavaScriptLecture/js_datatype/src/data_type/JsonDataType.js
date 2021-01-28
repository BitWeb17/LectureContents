function JsonDataType() {
    var person = {
        name: "Sanghoon",
        major: "Electronics",
        minor: "Computer Science",
        numOfRepo: 200
    }

    console.log("JsonDataType: " + person)

    return (
        <div className="JsonDataType">
            <p>
                {person.name}, {person.major}<br/>
                {person.minor}, {person.numOfRepo}<br/>
            </p>
        </div>
    )
}

export default JsonDataType