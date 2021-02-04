const PromiseTest = () => {
    console.log("PromiseTest Start")

    const promise = new Promise(
        function (resolve, reject) {
            setTimeout(function () {
                console.log("Hello ")
                resolve();
            }, 2000)
        }
    )

    promise.then(function () {
        console.log("World!!!")
    })

    console.log("PromiseTest Fin")

    return (
        <div className="PromiseTest">
            <p>PromiseTest</p>
        </div>
    )
}

export default PromiseTest