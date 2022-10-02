# 숫자 야구 게임
## 기능 요구사항
- 기본적으로 1부터 9까지 서로 다른 수로 이루어진 3자리의 수를 맞추는 게임이다.
- 같은 수가 같은 자리에 있으면 스트라이크, 다른 자리에 있으면 볼, 같은 수가 전혀 없으면 낫싱이란 힌트를 얻고, 그 힌트를
  이용해서 먼저 상대방(컴퓨터)의 수를 맞추면 승리한다.
    - [예] 상대방(컴퓨터)의 수가 425일 때,
        - 123을 제시한 경우 : 1스트라이크
        - 456을 제시한 경우 : 1볼 1스트라이크
        - 789를 제시한 경우 : 낫싱
- 위 숫자 야구게임에서 상대방의 역할을 컴퓨터가 한다. 컴퓨터는 1에서 9까지 서로 다른 임의의 수 3개를 선택한다. 게임 플레이어는 컴퓨터가 생각하고 있는 3개의 숫자를 입력하고, 컴퓨터는 게임 플레이어가 입력한 숫자에 대한 결과를 출력한다.
- 이 같은 과정을 반복해 컴퓨터가 선택한 3개의 숫자를 모두 맞히면 게임이 종료된다.
- 게임을 종료한 후 게임을 다시 시작하거나 완전히 종료할 수 있다.
- 사용자가 잘못된 값을 입력할 경우 IllegalArgumentException을 발생시킨 후 애플리케이션은 종료되어야 한다.

## 구현할 기능 목록
1. 게임시작 시 컴퓨터는 1 ~ 9까지 서로 다른 수로 이루어진 3개의 공을 생성한다.
2. 플레이어는 1 ~ 9까지 서로 다른 수로 이루어진 3자리 수를 입력한다.
    - 플레이어가 입력이 아래의 규칙을 지키지 않을 경우 IllegalArgumentException을 발생시키고 게임을 종료한다.
        - 플레이어가 입력한 값의 길이는 3이어야 한다.
        - 플레이어가 입력한 값은 숫자로만 이루어져 있어야 한다.
3. 플레이어가 입력한 값을 토대로 공을 생성한다.
4. 심판은 플레이어와 컴퓨터가 보유한 공을 아래의 규칙을 통해 비교하고 게임의 결과를 생성한다.
    - 플레이어와 컴퓨터가 보유한 공 중 **값이 같고 자리가 같은 공이 있을 경우** - 스트라이크
        - [예] 컴퓨터가 보유한 공이 4 2 5 이고 플레이어가 보유한 공이 4 3 5일 경우 - **2스트라이크**
    - 플레이어와 컴퓨터가 보유한 공 중 **값이 같지만 자리가 다른 공이 있을 경우** - 볼
        - [예] 컴퓨터가 보유한 공이 4 2 5 이고 플레이어가 보유한 공이 2 3 6일 경우 - **1볼**
        - [예] 컴퓨터가 보유한 공이 4 2 5 이고 플레이어가 보유한 공이 2 3 5일 경우 - **1스트라이크 1볼**
    - 플레이어와 컴퓨터가 보유한 공 중 **같은 값을 가진 공이 없을 경우** - 낫싱
        - [예] 컴퓨터가 보유한 공이 4 2 5 이고 플레이어가 보유한 공이 3 7 9일 경우 - **낫싱**
5. 게임의 결과를 출력한다.
6. 게임의 결과가 3스트라이크일 경우 게임을 종료한다.
    - 게임의 결과가 3스트라이크가 아닐 경우 2 ~ 5번의 과정을 반복한다.
7. 게임이 종료되었을 경우 플레이어는 게임의 재시작 여부를 입력한다.
    - 1을 입력해 게임을 재시작한다.
    - 2를 입력해 게임을 종료한다.
    - 다른 값을 입력한 경우 게임을 종료한다.

## Test Results
![스크린샷 2022-10-02 오후 5 19 05](https://user-images.githubusercontent.com/44702580/193444986-45c56ae7-5c7c-4a75-b37e-9ccbb0a00db2.png)