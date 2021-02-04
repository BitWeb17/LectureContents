function first() {
    return new Promise(function (resolve, reject) {
        var sum = 0
        
        for (var i = 0; i <= 100000000; i++) {
            sum += (i * 0.000000001) * Math.sin(i * Math.PI / 180.0)
        }

        resolve(sum)
    })
}

function second() {
    return new Promise(function (resolve, reject) {
        var sum = 0
        
        for (var i = 0; i <= 100000000; i++) {
            sum += (i * 0.00000001) * Math.cos(i * Math.PI / 90.0)
        }

        resolve(sum)
    })
}

function third() {
    return new Promise(function (resolve, reject) {
        var sum = 0
        
        for (var i = 0; i <= 100000000; i++) {
            sum += (i * 0.0000001) * Math.sin(i * Math.PI / 270.0)
        }

        resolve(sum)
    })
}

function fourth() {
    return new Promise(function (resolve, reject) {
        var sum = 0
        
        for (var i = 0; i <= 100000000; i++) {
            sum += (i * 0.000001) * Math.cos(i * Math.PI / 240.0)
        }

        resolve(sum)
    })
}

async function asyncProcess() {
    const res = await Promise.all(
        [
            first(),
            second(),
            third(),
            fourth()
        ]
    )

    console.log(res)
}

asyncProcess()

const TestPromiseVersion = () => {
    console.log("TestPromiseVersion Start")

    console.log("TestPromiseVersion End")

    return (
        <div className="TestPromiseVersion">
            <p>TestPromiseVersion</p>
        </div>
    )
}

export default TestPromiseVersion