 class EggVoice extends Thread
{
    @Override
    public void run()
    {
        for(int i = 0; i < 5; i++)
        {
            try{
                sleep(1000);
            }catch(InterruptedException e){}

            System.out.println("����!");
        }

    }
}

class ChickenVoice {
    static EggVoice mAnotherOpinion;

    public static void main(String[] args) {
        mAnotherOpinion = new EggVoice();
        System.out.println("���� �����...");
        mAnotherOpinion.start();

        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }

            System.out.println("������!");
        }

//����� ������� ������� 5 ���

        if (mAnotherOpinion.isAlive()) {
            try {
                mAnotherOpinion.join();
            } catch (InterruptedException e) {
            }

            System.out.println("������ ��������� ����!");
        } else
            System.out.println("������ ��������� ������!");

        System.out.println("���� ��������!");
    }
}

