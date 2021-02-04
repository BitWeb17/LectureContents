const NonPromiseTest = () => {
    function hello() {
        setTimeout(function () {
            console.log("Hello ")
        }, 2000)
    }

    function world() {
        setTimeout(function () {
            console.log("World!!!")
        }, 1000)
    }

    hello()
    world()

    return (
        <div className="NonPromiseTest">
            <p>NonPromiseTest</p>
        </div>
    )
}

export default NonPromiseTest