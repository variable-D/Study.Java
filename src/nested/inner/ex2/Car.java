package nested.inner.ex2;



public class Car {
    private String model;
    private int chargeLevel;
    private Engine engine;

    public Car(String model, int chargeLevel) {
        this.model = model;
        this.chargeLevel = chargeLevel;
        this.engine = new Engine(); // 이렇게 하면 Engine 인스턴스는 자신을 생성한 바깥의 Car 인스턴스를 자동으로 참조하게 된다.'
    }

    /*“이렇게 하면 Engine 인스턴스는 자신을 생성한 바깥의 Car 인스턴스를 자동으로 참조하게 된다.”

	•	해석: Engine 인스턴스는 자동으로 자신을 생성한 Car 인스턴스를 참조한다.
	•	사실 여부: 정확한 설명입니다.

설명:

	•	내부 클래스의 인스턴스는 암묵적으로 외부 클래스의 인스턴스를 참조합니다.
	•	따라서 Engine 클래스 내부에서는 Car 클래스의 멤버 변수나 메서드에 직접 접근할 수 있습니다.
	•	이는 내부 클래스의 인스턴스가 외부 클래스의 인스턴스와 연결되어 있기 때문입니다.
*/

    // getter 도 없어도 내부 클래스에서 접근이 가능하다.

    public void start() {
        engine.start();
        System.out.println(model + " 시작 완료");
    }
    private class Engine {
        // car 대한 정보가 없어서도 내부 클래스는 바깥 클래스에 접근을 할 수 있기 때문이다. 정보가 굳이 없어도 접근이 가능하다.

        public void start () {
            System.out.println("충전 레벨 확인: " + chargeLevel);
            System.out.println(model + "의 엔진을 구동합니다.");
        }
    }
}

/*1. 바깥 클래스의 생성자에서 내부 클래스 인스턴스를 생성하는 이유

객체의 구성요소 초기화:

Car 클래스는 자동차를 나타내며, Engine 클래스는 그 엔진을 나타냅니다. 자동차는 엔진을 필수적으로 포함하므로, Car 객체가 생성될 때 Engine 객체도 함께 생성하는 것이 자연스럽습니다.

일관된 상태 유지:

이렇게 하면 Car 객체는 항상 유효한 Engine 객체를 가지고 있게 되어, 객체의 일관성과 안정성이 높아집니다. 이는 객체 지향 프로그래밍에서 중요한 캡슐화와 응집성을 강화합니다.

2. 그렇게 하면 어떤 이점이 있는가?

a. 가독성 향상:

	•	중앙 집중화: 객체 생성과 초기화 로직이 Car 클래스의 생성자에 집중되어 코드 구조가 명확해집니다.
	•	코드의 단순화: 외부에서 Engine 객체를 별도로 생성하고 Car 객체에 설정하는 추가 코드가 필요 없어집니다.

b. 효율성 향상:

	•	인스턴스 생성 횟수 감소: 필요한 객체를 한 번에 생성하므로 불필요한 인스턴스 생성이 줄어듭니다.
	•	메모리 관리 최적화: 객체 생명주기를 함께 관리하여 메모리 사용을 효율적으로 할 수 있습니다.

c. 유지보수 용이성:

	•	변경에 대한 안정성: 내부 구현이 변경되더라도 외부 코드에 영향이 최소화됩니다.
	•	확장성: 새로운 기능 추가 시 객체 간의 관계가 명확하여 수정이 용이합니다.
*/
