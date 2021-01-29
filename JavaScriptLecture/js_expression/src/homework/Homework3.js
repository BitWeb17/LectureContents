const Homework3 = () => {
    const INIT = 1;

    const START = 0;
    const END = 15;

    const CRITERIA = 10;

    var emp = [];

    for(var i = START; i < END; i++) {
        emp[i] = (Math.random() * CRITERIA) + INIT;
        console.log("Homework3: %d - %d", i, emp[i])
    }

    return (
        <div className="Homework3">
            <p>
                Homework 3
            </p>
        </div>
    )
}

export default Homework3