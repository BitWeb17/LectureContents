const NonPromiseTest2 = () => {
    function helloWorld() {
        setTimeout(function () {
            console.log("Hello ")

            setTimeout(function () {
                console.log("World ~~!!~!")
            }, 1000)
        }, 2000)
    }

    helloWorld()

    return (
        <div className="NonPromiseTest2">
            <p>NonPromiseTest2</p>
        </div>
    )
}

export default NonPromiseTest2