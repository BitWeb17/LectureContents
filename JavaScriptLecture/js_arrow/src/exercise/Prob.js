const AllocRandomNumber = (arr) => {
    console.log("AllocRandomNumber Called")

    for(var i = 0; i < arr.length; i++) {
        arr[i] = Math.floor(Math.random() * 10000) + 1
    }
}

const CheckTeamArrCount = (arr) => {
    const TEAMMEMNUM = 4
}

const CreateRandomTeam = (arr, num) => {
    console.log("CreateRandomTeam Called")

    const ERROR = -1

    let randNum
    let range = arr.length / num

    let checkTeamArrCnt = new Array(250)

    // 같은 팀원들에게 같은 숫자를 부여하겠다는 의미(250개가 나오니까)
    for(var i = 0; i < num; i++) {             // 4
        for (var j = 0; j < range; ) {   // 250
            // 1번팀, 2번팀, 3번팀 ...
            randNum = Math.floor(Math.random() * 250) + 1

            // 전략
            // 1) 그냥 다 검사해서 집어넣기
            //    모든 검사를 수행하므로 속도가 느려짐
            //    반면 팀원들은 인접하지 않은 상태로 배치됨
            // 2) 검사는 단순화하고 for문을 한 번 더 돌자!
            //    (내부에 4개짜리 루프를 돌린다)
            //    팀원끼리 인접해있게 됨

            console.log("i = " + i + ", j = " + j)

            // 우리는 2번 전략을 사용하도록 한다.
            if(arr.indexOf(randNum) == ERROR) {

                console.log("Insert Array Value = " + randNum)

                for (var k = j; k < k + num; k++) {
                    // 0 ~ 999 ---> i, j로 표현하는 방법에 대한 고민이 필요
                    // j = 0 ~ 3
                    // i = 0 ~ 250
                    // i * range + j
                    // range = 250이므로 여기서 i * range + k를 하면
                    // 250개 단위로 4개를 할당하는 형식이 된다.
                    // 결국 0 ~ 999를 표현할 수 있으면서
                    // 4개씩 끊어칠 수 있게 인덱싱 방식의 수정이 필요
                    arr[i * range + k] = randNum
                }

                j += 4
            }
        }
    }
}

const CheckWinner = () => {

}

const CalcDividend = () => {

}

const Prob = () => {
    const MAXTEAMNUM = 4
    const NUMOFPERSON = 1000
    const FEE = 10000000
    const PARTICIPANTSTAKE = 0.67
    const PRICE = NUMOFPERSON * FEE * PARTICIPANTSTAKE

    console.log("상금 = " + PRICE)

    let arr = new Array(NUMOFPERSON)
    let teamArr = new Array(NUMOFPERSON)

    AllocRandomNumber(arr)
    console.log("After AllocRandomNumber() = " + arr)

    CreateRandomTeam(teamArr, MAXTEAMNUM)
    console.log("After CreateRandomTeam() = " + teamArr)

    return (
        <div className="Prob">
            <p>Prob</p>
        </div>
    )
}

export default Prob