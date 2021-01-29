const RandomTeam = () => {
    let teamA = [
        "최현정", "오진욱", "류슬기", "장해솔", "조진형",
        "이정현", "고동영", "박재민", "한다은"
    ]
    let teamB = [
        "최임식", "탁성진", "하진주", "이범진",
        "이승윤", "박기범", "박소현", "노찬욱"
    ]

    let lenA = teamA.length
    let lenB = teamB.length

    let res1 = []
    let res2 = []

    const ERROR = -1

    let randArrIdx

    let i

    console.log(lenA)

    for(i = 0; i < lenA; ) {
        randArrIdx = Math.floor(Math.random() * lenA)

        //console.log("randArrIdx = " + randArrIdx)

        if(res1.indexOf(teamA[randArrIdx]) == ERROR) {
            res1.push(teamA[randArrIdx])
            console.log("res1: %d - %s", i, res1[i++])
        }
    }

    for(i = 0; i < lenB; ) {
        randArrIdx = Math.floor(Math.random() * lenB)

        if(res2.indexOf(teamB[randArrIdx]) == ERROR) {
            res2.push(teamB[randArrIdx])
            console.log("res2: %d - %s", i, res1[i++])
        }
    }

    return (
        <div className="RandomTeam">
            <p>
                Random Test
            </p>
        </div>
    )
}

export default RandomTeam