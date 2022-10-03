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

            System.out.println("€йцо!");
        }

    }
}

class ChickenVoice {
    static EggVoice mAnotherOpinion;

    public static void main(String[] args) {
        mAnotherOpinion = new EggVoice();
        System.out.println("—пор начат...");
        mAnotherOpinion.start();

        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }

            System.out.println("курица!");
        }

//—лово Ђкурицаї сказано 5 раз

        if (mAnotherOpinion.isAlive()) {
            try {
                mAnotherOpinion.join();
            } catch (InterruptedException e) {
            }

            System.out.println("ѕервым по€вилось €йцо!");
        } else
            System.out.println("ѕервой по€вилась курица!");

        System.out.println("—пор закончен!");
    }
}

