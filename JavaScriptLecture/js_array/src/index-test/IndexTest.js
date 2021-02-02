const IndexTest = () => {
    let vendors = ["ti", "stm", "adi", "nvidia", "qualcomm",
                    "xilinx", "amd", "nxp", "freescale", "infineon",
                    "xilinx", "amd", "nxp", "freescale", "infineon"]
    let lastIdx = vendors.lastIndexOf("freescale")

    console.log(vendors)
    console.log("Where is it ? " + lastIdx)

    let idx = vendors.indexOf("freescale")

    console.log("Where is it ? " + idx)

    return (
        <div className="IndexTest">
            <p>
                index-test: IndexTest
            </p>
        </div>
    )
}

export default IndexTest