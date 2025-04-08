# Hyperledger Fabric Dev Network with Fablo

> [!IMPORTANT]
> The test network will not work with the default configuration unless one of the `chaincode-*/` directories in the repository root become `chaincode/`.
> Also, do not forget to adjust the `lang` property of the chaincode (`java`, `node`, or `golang`).
> See the [README](../README.md).


## Spin up the test network

> [!TIP]
> Use https://learn.microsoft.com/en-us/windows/wsl/install[WSL] if working in Windows.

```console
$ ./fablo up
```
