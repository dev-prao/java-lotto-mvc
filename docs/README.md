1. frontController 인스턴스 생성 및 초기화
   1) Map<String, Object> controllers에 값 추가(key, value)
      a. "1" : LottoBuyController
      b. "2" : LottoCountController
      c. "3" : LottoGetController
      d. "4" : LottoEndController
   2) List<Adapter> adapters에 값 추가
      a. ControllerV3Adatper
      b. ControllerV4Adapter
      c. ControllerV5Adapter
2. String menu = "0"으로 초기 입력 0으로 초기화
3. menu가 END(4)가 아닐 경우 반복문 수행
   1) menu에 InputView.inputMenu()로 입력받은 값 대입
   2) frontController의 service() 메서드에 menu를 대입하여 실행

4. service() 메서드
   1) 입력받은 path(menu에 해당하는 값)을 controllers.get(path)를 통해 Object 타입인 controller에 대입
      [예시] 3을 입력받았으면 LottoGetController를 controller에 저장
   2) findAdapter에 LottoGetController 를 대입하여 adapters를 탐색한다.
   3) 해당하는 isSupport(LottoGetController)가 true를 반환하는 값이 있다면 해당 adapter를 반환하고 없을 경우 IllegalArgumentException을 던진다. (ControllerV4Adapter)
   4) adapter의 process(LottoGetController)를 실행한다.
   5) LottoGetController 인스턴스를 생성한다.
   6) Map<String, Object> model을 생성한다.
   7) LottoGetController의 process(model)을 실행한다.
   8) lottoRepository.findAll()의 값을 List<Lotto> lottos에 저장한다.
   9) mapToInteger(List<Lotto> lottos)로 각 Lotto의 getLotto를 실행해 List<Integer> 형태로 반환하여 배열에 저장 후 반환한다.
   10) model에 "lottos" : mapToInteger(lottos)를 추가한다.
   11) String 타입의 "get"을 반환한다.
   12) viewPath에 "get"을 저장한다.
   13) ViewModel("get", ("lottos", mapToInteger(lottos)))을 반환한다.
   14) viewModel.render()을 실행한다.
   15) OutputViewFactory.getInstance()를 실행하여 싱글턴 형태의 인스턴스를 viewFactory에 저장한다.
   16) viewFactory.get("get")으로 LottoGetOutputView를 viewable에 저장한다.
   17) LottoGetOutputView.render("lottos", mapToInteger(lottos))를 실행한다.
   18) List<List<Integer>> lottos를 순회하며 List<Integer> lotto를 출력한다.
